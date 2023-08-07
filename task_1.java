@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertTrue ("Пользователь старше 18 лет, метод должен вернуть true" , isAdult); // Напиши код здесь
        assertEquals("Ожидается, что метод checkIsAdult вернет true", true, isAdult);
        }