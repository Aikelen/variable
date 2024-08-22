public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstMan = 78.2;
        var secondMan = 82.7;
        System.out.println("Общая масса бойцов" + firstMan + secondMan);
        System.out.println("Разница между бойцами " + (secondMan - firstMan));
        System.out.println("Остаток от деления между бойцами " + (firstMan % secondMan));


        var allHour = 640;
        var onePerson = 8;
        var allPerson = (allHour / onePerson);
        System.out.println("Всего работников в компании - " + allPerson + " человек");
        allPerson = allPerson + 94;
        System.out.println("Если в компании работает" + allPerson + "то всего" + allPerson * onePerson + "часов работы может быть поделено между сотрудниками");

    }
}