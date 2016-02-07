package cworks.app.sys;


import cworks.app.domain.Unique;

import java.util.Arrays;
import java.util.Collection;

public class SysKey implements Unique {

    private static final String SysKey_Default_Name = "sys_key";
    private String name;
    private Object[] fields;

    public SysKey(final Object[] fields) {
        this.name = SysKey_Default_Name;
        this.fields = fields;
    }

    public SysKey(final String name, final Object[] fields) {
        this.name = name;
        this.fields = fields;
    }

    public SysKey(final Long value) {
        this.name = SysKey_Default_Name;
        this.fields = new Long[1];
        this.fields[0] = value;
        errorIfNull(fields);
    }

    public SysKey(final String name, final Long value) {
        this.name = name;
        this.fields = new Long[1];
        this.fields[0] = value;
        errorIfNull(fields);
    }

    public SysKey(final Object value) {
        this.name = SysKey_Default_Name;
        this.fields = new Object[1];
        this.fields[0] = value;
        errorIfNull(fields);
    }


    public SysKey(final String name, final Object value) {
        this.name = name;
        this.fields = new Object[1];
        this.fields[0] = value;
        errorIfNull(fields);
    }

    public SysKey(final Object val1, final Object val2) {
        this.fields = new Object[2];
        this.fields[0] = val1;
        this.fields[1] = val2;
        errorIfNull(fields);
    }

    public SysKey(final String name, final Object val1, final Object val2) {
        this.name = name;
        this.fields = new Object[2];
        this.fields[0] = val1;
        this.fields[1] = val2;
        errorIfNull(fields);
    }

    public boolean equals(Object object) {
        if(!(object instanceof SysKey)) {
            return false;
        }

        SysKey other = (SysKey)object;
        if(this.fields.length != other.fields.length) {
            return false;
        }
        for(int i = 0; i < fields.length; i++) {
            if(!this.fields[i].equals(other.fields[i])) {
                return false;
            }
        }
        return true;
    }

    public Object value(int i) {
        return this.fields[i];
    }

    @Override
    public Collection<Object> values() {
        return Arrays.asList(this.fields);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Object value() {
        return this.fields[0];
    }

    private void errorIfNull(Object[] fields) {
        if(fields == null) {
            throw new IllegalArgumentException("Cannot have a null SysKey");
        }
        for (Object field : this.fields) {
            if (field == null) {
                throw new IllegalArgumentException("Cannot have a null SysKey element");
            }
        }
    }
}
