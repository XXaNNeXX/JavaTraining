public class Story {

    //https://open.spotify.com/episode/59XUvE0nPwZoQVmJyKC8gg

    //Aufsummieren aller Zahlen von 1 bis 100
    static int Aufsummieren1(int upperLimit) {
        int summe = 0;
        for(int i=1;i<=upperLimit;i++) {
            summe += i;
        }
        return summe;
    }

    //Aufsummieren aller Zahlen von 100 bis 1
    static int Aufsummieren2(int upperLimit) {
        if(upperLimit == 1) {
            return 1;
        }
        else {
            return upperLimit + Aufsummieren2(upperLimit - 1);
        }
    }

    //Aufsummieren aller Zahlen von 1 bis 100 und 100 bis 1
    static int Aufsummieren3(int upperLimit) {
        int summe = 0;
        for(int i=1;i<upperLimit;i++) {
            summe = (upperLimit + 1)*(upperLimit/2);
        }
        return summe;
    }

    public static void main(String[] args) {
        System.out.println(Aufsummieren1(100));
        System.out.println(Aufsummieren2(100));
        System.out.println(Aufsummieren3(100));  
    }

}