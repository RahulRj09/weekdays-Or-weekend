#!/usr/bin/env bash
javac WeekdaysOrWeekendChecker.java
java WeekdaysOrWeekendChecker sunday > actual
diff actual expectedWeekend
java WeekdaysOrWeekendChecker rahul > actual
diff actual expectedInvalidInput
java WeekdaysOrWeekendChecker monday > actual
diff actual expectedWeekdays