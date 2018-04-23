package com.handpay.coupon.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.handpay.coupon.entity.StoreData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STORE_DATA".
*/
public class StoreDataDao extends AbstractDao<StoreData, String> {

    public static final String TABLENAME = "STORE_DATA";

    /**
     * Properties of entity StoreData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Sid = new Property(0, String.class, "sid", true, "SID");
        public final static Property BusinessName = new Property(1, String.class, "businessName", false, "BUSINESS_NAME");
        public final static Property BranchName = new Property(2, String.class, "branchName", false, "BRANCH_NAME");
        public final static Property Province = new Property(3, String.class, "province", false, "PROVINCE");
        public final static Property City = new Property(4, String.class, "city", false, "CITY");
        public final static Property District = new Property(5, String.class, "district", false, "DISTRICT");
        public final static Property Address = new Property(6, String.class, "address", false, "ADDRESS");
        public final static Property Telephone = new Property(7, String.class, "telephone", false, "TELEPHONE");
        public final static Property Categories = new Property(8, String.class, "categories", false, "CATEGORIES");
        public final static Property OffsetType = new Property(9, int.class, "offsetType", false, "OFFSET_TYPE");
        public final static Property Longitude = new Property(10, double.class, "longitude", false, "LONGITUDE");
        public final static Property Latitude = new Property(11, double.class, "latitude", false, "LATITUDE");
        public final static Property PhotoListHeadUrl = new Property(12, String.class, "photoListHeadUrl", false, "PHOTO_LIST_HEAD_URL");
        public final static Property PhotoListContentUrl = new Property(13, String.class, "photoListContentUrl", false, "PHOTO_LIST_CONTENT_URL");
        public final static Property Recommend = new Property(14, String.class, "recommend", false, "RECOMMEND");
        public final static Property Special = new Property(15, String.class, "special", false, "SPECIAL");
        public final static Property Introduction = new Property(16, String.class, "introduction", false, "INTRODUCTION");
        public final static Property OpenTime = new Property(17, String.class, "openTime", false, "OPEN_TIME");
        public final static Property AvgPrice = new Property(18, int.class, "avgPrice", false, "AVG_PRICE");
    }


    public StoreDataDao(DaoConfig config) {
        super(config);
    }
    
    public StoreDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STORE_DATA\" (" + //
                "\"SID\" TEXT PRIMARY KEY NOT NULL ," + // 0: sid
                "\"BUSINESS_NAME\" TEXT," + // 1: businessName
                "\"BRANCH_NAME\" TEXT," + // 2: branchName
                "\"PROVINCE\" TEXT," + // 3: province
                "\"CITY\" TEXT," + // 4: city
                "\"DISTRICT\" TEXT," + // 5: district
                "\"ADDRESS\" TEXT," + // 6: address
                "\"TELEPHONE\" TEXT," + // 7: telephone
                "\"CATEGORIES\" TEXT," + // 8: categories
                "\"OFFSET_TYPE\" INTEGER NOT NULL ," + // 9: offsetType
                "\"LONGITUDE\" REAL NOT NULL ," + // 10: longitude
                "\"LATITUDE\" REAL NOT NULL ," + // 11: latitude
                "\"PHOTO_LIST_HEAD_URL\" TEXT," + // 12: photoListHeadUrl
                "\"PHOTO_LIST_CONTENT_URL\" TEXT," + // 13: photoListContentUrl
                "\"RECOMMEND\" TEXT," + // 14: recommend
                "\"SPECIAL\" TEXT," + // 15: special
                "\"INTRODUCTION\" TEXT," + // 16: introduction
                "\"OPEN_TIME\" TEXT," + // 17: openTime
                "\"AVG_PRICE\" INTEGER NOT NULL );"); // 18: avgPrice
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STORE_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, StoreData entity) {
        stmt.clearBindings();
 
        String sid = entity.getSid();
        if (sid != null) {
            stmt.bindString(1, sid);
        }
 
        String businessName = entity.getBusinessName();
        if (businessName != null) {
            stmt.bindString(2, businessName);
        }
 
        String branchName = entity.getBranchName();
        if (branchName != null) {
            stmt.bindString(3, branchName);
        }
 
        String province = entity.getProvince();
        if (province != null) {
            stmt.bindString(4, province);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(5, city);
        }
 
        String district = entity.getDistrict();
        if (district != null) {
            stmt.bindString(6, district);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(7, address);
        }
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(8, telephone);
        }
 
        String categories = entity.getCategories();
        if (categories != null) {
            stmt.bindString(9, categories);
        }
        stmt.bindLong(10, entity.getOffsetType());
        stmt.bindDouble(11, entity.getLongitude());
        stmt.bindDouble(12, entity.getLatitude());
 
        String photoListHeadUrl = entity.getPhotoListHeadUrl();
        if (photoListHeadUrl != null) {
            stmt.bindString(13, photoListHeadUrl);
        }
 
        String photoListContentUrl = entity.getPhotoListContentUrl();
        if (photoListContentUrl != null) {
            stmt.bindString(14, photoListContentUrl);
        }
 
        String recommend = entity.getRecommend();
        if (recommend != null) {
            stmt.bindString(15, recommend);
        }
 
        String special = entity.getSpecial();
        if (special != null) {
            stmt.bindString(16, special);
        }
 
        String introduction = entity.getIntroduction();
        if (introduction != null) {
            stmt.bindString(17, introduction);
        }
 
        String openTime = entity.getOpenTime();
        if (openTime != null) {
            stmt.bindString(18, openTime);
        }
        stmt.bindLong(19, entity.getAvgPrice());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, StoreData entity) {
        stmt.clearBindings();
 
        String sid = entity.getSid();
        if (sid != null) {
            stmt.bindString(1, sid);
        }
 
        String businessName = entity.getBusinessName();
        if (businessName != null) {
            stmt.bindString(2, businessName);
        }
 
        String branchName = entity.getBranchName();
        if (branchName != null) {
            stmt.bindString(3, branchName);
        }
 
        String province = entity.getProvince();
        if (province != null) {
            stmt.bindString(4, province);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(5, city);
        }
 
        String district = entity.getDistrict();
        if (district != null) {
            stmt.bindString(6, district);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(7, address);
        }
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(8, telephone);
        }
 
        String categories = entity.getCategories();
        if (categories != null) {
            stmt.bindString(9, categories);
        }
        stmt.bindLong(10, entity.getOffsetType());
        stmt.bindDouble(11, entity.getLongitude());
        stmt.bindDouble(12, entity.getLatitude());
 
        String photoListHeadUrl = entity.getPhotoListHeadUrl();
        if (photoListHeadUrl != null) {
            stmt.bindString(13, photoListHeadUrl);
        }
 
        String photoListContentUrl = entity.getPhotoListContentUrl();
        if (photoListContentUrl != null) {
            stmt.bindString(14, photoListContentUrl);
        }
 
        String recommend = entity.getRecommend();
        if (recommend != null) {
            stmt.bindString(15, recommend);
        }
 
        String special = entity.getSpecial();
        if (special != null) {
            stmt.bindString(16, special);
        }
 
        String introduction = entity.getIntroduction();
        if (introduction != null) {
            stmt.bindString(17, introduction);
        }
 
        String openTime = entity.getOpenTime();
        if (openTime != null) {
            stmt.bindString(18, openTime);
        }
        stmt.bindLong(19, entity.getAvgPrice());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public StoreData readEntity(Cursor cursor, int offset) {
        StoreData entity = new StoreData( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // sid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // businessName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // branchName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // province
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // city
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // district
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // address
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // telephone
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // categories
            cursor.getInt(offset + 9), // offsetType
            cursor.getDouble(offset + 10), // longitude
            cursor.getDouble(offset + 11), // latitude
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // photoListHeadUrl
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // photoListContentUrl
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // recommend
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // special
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // introduction
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // openTime
            cursor.getInt(offset + 18) // avgPrice
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, StoreData entity, int offset) {
        entity.setSid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBusinessName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBranchName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setProvince(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCity(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDistrict(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAddress(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTelephone(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCategories(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setOffsetType(cursor.getInt(offset + 9));
        entity.setLongitude(cursor.getDouble(offset + 10));
        entity.setLatitude(cursor.getDouble(offset + 11));
        entity.setPhotoListHeadUrl(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setPhotoListContentUrl(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setRecommend(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setSpecial(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setIntroduction(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setOpenTime(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setAvgPrice(cursor.getInt(offset + 18));
     }
    
    @Override
    protected final String updateKeyAfterInsert(StoreData entity, long rowId) {
        return entity.getSid();
    }
    
    @Override
    public String getKey(StoreData entity) {
        if(entity != null) {
            return entity.getSid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(StoreData entity) {
        return entity.getSid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
