#!/usr/bin/env bash
javac DayWeekdaysOrWeekend.java
java DayWeekdaysOrWeekend sunday > actual
diff actual expectedOutput
java DayWeekdaysOrWeekend rahul > actual
diff actual expectedOutput1
java DayWeekdaysOrWeekend monday > actual
diff actual expectedOutput2