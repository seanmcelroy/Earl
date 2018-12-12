package com.einmalfel.earl.test;

import org.junit.Test;

import java.util.Date;

public class UtilsTest {
    @Test
    public void parseDate() {

        final Date date = com.einmalfel.earl.Utils.parseDate("Tue, 11 Dec 2018 14:34:41 +0000");
        assert(date.getTime() > 0);
    }
}
