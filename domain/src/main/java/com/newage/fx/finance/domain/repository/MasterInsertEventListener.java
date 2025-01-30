package com.newage.fx.finance.domain.repository;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;

public class MasterInsertEventListener implements PostInsertEventListener  {

    public static final MasterInsertEventListener INSTANCE = new MasterInsertEventListener();
    private static final String ACTION_TYPE = "INSERT";

    @Override
    public void onPostInsert ( PostInsertEvent event ) throws HibernateException {

        final Object entity = event.getEntity();
        //todo
    }

    @Override
    public boolean requiresPostCommitHanding ( EntityPersister persister ) {

        return false;
    }
}
