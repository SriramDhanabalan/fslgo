package com.newage.fx.finance.domain.repository;

import org.hibernate.event.spi.PostDeleteEvent;
import org.hibernate.event.spi.PostDeleteEventListener;
import org.hibernate.persister.entity.EntityPersister;

public class MasterDeleteEventListener implements PostDeleteEventListener {

    public static final MasterDeleteEventListener INSTANCE = new MasterDeleteEventListener();
    private static final String ACTION_TYPE = "DELETE";

    @Override
    public void onPostDelete ( PostDeleteEvent event ) {

        final Object entity = event.getEntity();
        //todo
    }

    @Override
    public boolean requiresPostCommitHanding ( EntityPersister persister ) {

        return false;
    }
}
