package com.foysal.comparator.exampl;

import java.util.*;

public class ComparatorImplementations {
    public static void sortingSchedules(List<Event> events) {
        //By implementing comparator
       /* events.sort(new Comparator<Event>() {
            @Override
            public int compare(Event event1, Event event2) {
                if (event1.getStartTime() < event2.getStartTime()) {
                    return -1;
                } else if (event1.getStartTime() == event2.getStartTime()) {
                    if (event1.getEndTime() <= event2.getEndTime()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return 0;
            }
        }); */

        // USING LAMDA EXPRESSION

       /* events.sort((Event event1, Event event2) -> {
                    if (event1.getStartTime() < event2.getStartTime()) {
                        return -1;
                    } else if (event1.getStartTime() == event2.getStartTime()) {
                        if (event1.getEndTime() <= event2.getEndTime()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                    return 0;
                }
        ); */

        // USING COLLECTIONS

        Collections.sort(events, Comparator.comparing(Event::getStartTime).thenComparing(Comparator.comparing(Event::getEndTime)));
        events.forEach((Event e) -> System.out.println(e.getStartTime() + " " + e.getEndTime()));
    }

    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();
        events.add(new Event(1, 3));
        events.add(new Event(5, 6));
        events.add(new Event(2, 4));
        events.add(new Event(8, 9));
        events.add(new Event(4, 5));
        events.add(new Event(3, 9));
        events.add(new Event(3, 5));
        sortingSchedules(events);
    }
}

class Event {
    private int startTime;
    private int endTime;

    public Event(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
