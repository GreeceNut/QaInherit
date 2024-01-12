package ru.netology.Inherit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test

    public void simpleTaskMatches () {
        SimpleTask simpleTask = new SimpleTask( 5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("родителям");
        Assertions.assertEquals(expected, actual);
    }
@Test
    public void simpleTaskDoesntMatches () {
        SimpleTask simpleTask = new SimpleTask( 5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("позвонить");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void meetingMatchesTopic () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = true;
        boolean actual = meeting.matches("3й");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void meetingMatchesProject () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = true;
        boolean actual = meeting.matches("Приложение");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void meetingDoesntMatches () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("вторник");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void epicMatches () {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);

}
@Test
    public void epicDoesntMatches () {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Картошка");
        Assertions.assertEquals(expected, actual);

    }

}