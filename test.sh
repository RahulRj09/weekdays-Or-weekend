#!/usr/bin/env bash
javac DayWeekdaysOrWeekend.java
java DayWeekdaysOrWeekend sunday > actual
diff actual expectedOutput