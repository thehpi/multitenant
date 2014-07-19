package nl.mrdm;

import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Iterator;

public class EntityInterceptor extends EmptyInterceptor {
    private static Logger logger = LoggerFactory.getLogger(EntityInterceptor.class);

    @Override
    public boolean onLoad(Object o, Serializable serializable, Object[] objects, String[] strings, Type[] types) throws CallbackException {
        logger.error("onLoad: "+o);
        return false;
    }

    @Override
    public boolean onFlushDirty(Object o, Serializable serializable, Object[] objects, Object[] objects2, String[] strings, Type[] types) throws CallbackException {
        logger.error("onFlushDirty: "+o);
        return false;
    }

    @Override
    public boolean onSave(Object o, Serializable serializable, Object[] objects, String[] strings, Type[] types) throws CallbackException {
        logger.error("onSave: "+o);
        return false;
    }

    @Override
    public void onDelete(Object o, Serializable serializable, Object[] objects, String[] strings, Type[] types) throws CallbackException {
        logger.error("onDelete: "+o);
    }

    @Override
    public void onCollectionRecreate(Object o, Serializable serializable) throws CallbackException {
        logger.error("onCollectionRecreate: "+o);
    }

    @Override
    public void onCollectionRemove(Object o, Serializable serializable) throws CallbackException {
        logger.error("onCollectionRemove: "+o);
    }

    @Override
    public void onCollectionUpdate(Object o, Serializable serializable) throws CallbackException {
        logger.error("onCollectionUpdate: "+o);
    }

    @Override
    public void preFlush(Iterator iterator) throws CallbackException {
        logger.error("preFlush");
        while(iterator.hasNext()) {
            Object o = iterator.next();
            logger.error("postFlush: "+o);
        }
    }

    @Override
    public void postFlush(Iterator iterator) throws CallbackException {
        logger.error("postFlush");
        while(iterator.hasNext()) {
            Object o = iterator.next();
            logger.error("postFlush: "+o);
        }
    }

    @Override
    public void afterTransactionBegin(Transaction transaction) {
        logger.error("afterTransactionBegin: "+transaction);
    }

    @Override
    public void beforeTransactionCompletion(Transaction transaction) {
        logger.error("beforeTransactionCompletion: "+transaction);
    }

    @Override
    public void afterTransactionCompletion(Transaction transaction) {
        logger.error("afterTransactionCompletion: "+transaction);
    }
}
