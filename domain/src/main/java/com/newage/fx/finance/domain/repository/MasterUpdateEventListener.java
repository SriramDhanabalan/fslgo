package com.newage.fx.finance.domain.repository;

import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;

public class MasterUpdateEventListener implements PostUpdateEventListener {

    public static final MasterUpdateEventListener INSTANCE = new MasterUpdateEventListener();
    private static final String ACTION_TYPE = "UPDATE";

    @Override
    public void onPostUpdate ( PostUpdateEvent event ) {

        final Object entity = event.getEntity();
        //todo
    }

    @Override
    public boolean requiresPostCommitHanding ( EntityPersister persister ) {

        return false;
    }
}
