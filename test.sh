#!/usr/bin/env bash
javac WeekdaysOrWeekendChecker.java
java WeekdaysOrWeekendChecker sunday > actual
diff actual expectedOutput
java WeekdaysOrWeekendChecker rahul > actual
diff actual expectedOutput1
java WeekdaysOrWeekendChecker monday > actual
diff actual expectedOutput2