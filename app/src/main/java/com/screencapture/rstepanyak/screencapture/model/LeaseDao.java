package com.screencapture.rstepanyak.screencapture.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.screencapture.rstepanyak.screencapture.model.Lease;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LEASE".
*/
public class LeaseDao extends AbstractDao<Lease, Long> {

    public static final String TABLENAME = "LEASE";

    /**
     * Properties of entity Lease.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Item = new Property(1, String.class, "item", false, "ITEM");
        public final static Property Comment = new Property(2, String.class, "comment", false, "COMMENT");
        public final static Property Leasedate = new Property(3, Long.class, "leasedate", false, "LEASEDATE");
        public final static Property Returndate = new Property(4, Long.class, "returndate", false, "RETURNDATE");
    };


    public LeaseDao(DaoConfig config) {
        super(config);
    }
    
    public LeaseDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LEASE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ITEM\" TEXT," + // 1: item
                "\"COMMENT\" TEXT," + // 2: comment
                "\"LEASEDATE\" INTEGER," + // 3: leasedate
                "\"RETURNDATE\" INTEGER);"); // 4: returndate
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LEASE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Lease entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String item = entity.getItem();
        if (item != null) {
            stmt.bindString(2, item);
        }
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(3, comment);
        }
 
        Long leasedate = entity.getLeasedate();
        if (leasedate != null) {
            stmt.bindLong(4, leasedate);
        }
 
        Long returndate = entity.getReturndate();
        if (returndate != null) {
            stmt.bindLong(5, returndate);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Lease readEntity(Cursor cursor, int offset) {
        Lease entity = new Lease( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // item
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // comment
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // leasedate
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4) // returndate
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Lease entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setItem(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setComment(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLeasedate(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setReturndate(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Lease entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Lease entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}