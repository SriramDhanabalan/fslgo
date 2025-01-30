package com.newage.fx.finance.application.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import com.newage.fx.finance.application.dto.mapper.UserMasterMapper;
import com.newage.fx.finance.application.dto.response.*;
import com.newage.fx.finance.domain.entity.UserMaster;
import com.newage.fx.finance.domain.repository.UserMasterRepository;
import com.newage.fx.finance.domain.util.JwtTokenUtil;
import com.newage.fx.finance.domain.util.PasswordUtil;
import com.newage.fx.finance.service.impl.UserMasterServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;



@RestController
@Log4j2
@RequestMapping("/api")

public class UserMasterController {
	@Autowired
	private @NonNull UserMasterRepository userRepository;
	@Autowired
	private @NonNull JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserMasterMapper userMasterMapper;
	@Autowired
	private UserMasterServiceImpl userMasterService;

	@GetMapping(value = "/verify",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> verify( @RequestParam("sUsername") String userId,@RequestParam("spassword") String password,
									@RequestHeader HttpHeaders httpHeader) throws Exception {
		UserMaster user = userRepository.findByUserId(userId);

		if(!user.getPassword().equals(password)) {
			ResponseError responseError = new ResponseError();
			responseError.setCode(String.valueOf(HttpStatus.BAD_REQUEST));
			responseError.setMessage(null);
			return ResponseEntity.badRequest().body(responseError);
		}
		String encryptedPassword = PasswordUtil.getEncryptedPassword(user.getPassword());


		LoginResponse loginResponse = new LoginResponse();

		loginResponse.setToken(encryptedPassword);
		loginResponse.setMessage(null);
		loginResponse.setResponse("SUCCESS");
		loginResponse.setVersion("V1");
		return ResponseEntity.ok(loginResponse);

	}

	@GetMapping(value = "/login",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> login( @RequestParam("sUsername") String userId,@RequestParam("spassword") String password,
			@RequestHeader HttpHeaders httpHeader) throws Exception {
		UserMaster user = userRepository.findByUserId(userId);
			String encryptedPassword = PasswordUtil.getEncryptedPassword(user.getPassword());
		if(!encryptedPassword.equals(password)) {
			ResponseError responseError = new ResponseError();
				responseError.setCode(String.valueOf(HttpStatus.BAD_REQUEST));
				responseError.setMessage(null);
				return ResponseEntity.badRequest().body(responseError);
		}

			final String token = jwtTokenUtil.generateToken(user);

			LoginResponse loginResponse = new LoginResponse();

			loginResponse.setToken(token);
			loginResponse.setMessage("Logged in Successfully.!");


			return ResponseEntity.ok(loginResponse);

	}

	@GetMapping(value = "/profile",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUserDetails(Principal principal, @RequestHeader HttpHeaders httpHeader, Principal principle) throws Exception {


		Map<String, Object> response = new HashMap<String, Object>();
		UserMaster user = userRepository.findByUserId(principal.getName());

		UserMasterResponseDTO userMasterResponseDTO = userMasterMapper.convertEntityToResponseDTO(userMasterService.findById(user.getRegistrationNo()));

		return ResponseEntity.ok(userMasterResponseDTO);

	}
}

		 

