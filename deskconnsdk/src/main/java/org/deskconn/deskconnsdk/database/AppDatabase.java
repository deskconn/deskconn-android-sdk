package org.deskconn.deskconnsdk.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {Service.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ServiceDao servicesDao();
}
