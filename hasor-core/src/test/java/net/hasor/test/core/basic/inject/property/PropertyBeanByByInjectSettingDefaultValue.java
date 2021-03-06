/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.test.core.basic.inject.property;
import net.hasor.core.InjectSettings;
import net.hasor.test.core.enums.SelectEnum;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

// 8 种基本类型和其包装类型，以及4种时间类型和常用的枚举、字符串
public class PropertyBeanByByInjectSettingDefaultValue {
    //
    @InjectSettings("")
    private byte          byteValue;
    @InjectSettings("")
    private Byte          byteValue2;
    //
    @InjectSettings("")
    private short         shortValue;
    @InjectSettings("")
    private Short         shortValue2;
    //
    @InjectSettings("")
    private int           intValue;
    @InjectSettings("")
    private Integer       intValue2;
    //
    @InjectSettings("")
    private long          longValue;
    @InjectSettings("")
    private Long          longValue2;
    //
    @InjectSettings("")
    private float         floatValue;
    @InjectSettings("")
    private Float         floatValue2;
    //
    @InjectSettings("")
    private double        doubleValue;
    @InjectSettings("")
    private Double        doubleValue2;
    //
    @InjectSettings("")
    private boolean       booleanValue;
    @InjectSettings("")
    private Boolean       booleanValue2;
    //
    @InjectSettings("")
    private char          charValue;
    @InjectSettings("")
    private Character     charValue2;
    //
    @InjectSettings("")
    private Date          dateValue1;
    @InjectSettings("")
    private java.sql.Date dateValue2;
    @InjectSettings("")
    private Time          dateValue3;
    @InjectSettings("")
    private Timestamp     dateValue4;
    //
    @InjectSettings("")
    private String        stringValue;
    @InjectSettings("")
    private SelectEnum    enumValue;

    //
    //
    //
    public byte getByteValue() {
        return byteValue;
    }

    public Byte getByteValue2() {
        return byteValue2;
    }

    public short getShortValue() {
        return shortValue;
    }

    public Short getShortValue2() {
        return shortValue2;
    }

    public int getIntValue() {
        return intValue;
    }

    public Integer getIntValue2() {
        return intValue2;
    }

    public long getLongValue() {
        return longValue;
    }

    public Long getLongValue2() {
        return longValue2;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public Float getFloatValue2() {
        return floatValue2;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public Double getDoubleValue2() {
        return doubleValue2;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public Boolean getBooleanValue2() {
        return booleanValue2;
    }

    public char getCharValue() {
        return charValue;
    }

    public Character getCharValue2() {
        return charValue2;
    }

    public Date getDateValue1() {
        return dateValue1;
    }

    public java.sql.Date getDateValue2() {
        return dateValue2;
    }

    public Time getDateValue3() {
        return dateValue3;
    }

    public Timestamp getDateValue4() {
        return dateValue4;
    }

    public String getStringValue() {
        return stringValue;
    }

    public SelectEnum getEnumValue() {
        return enumValue;
    }
}
