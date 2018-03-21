public class CoinCase {
    public int fiveHundred;
    public int oneHundred;
    public int fifty;
    public int ten;
    public int five;
    public int one;

    public CoinCase(){
        this.fiveHundred = 0;
        this.oneHundred = 0;
        this.fifty = 0;
        this.ten = 0;
        this.five = 0;
        this.one = 0;
    }

    public CoinCase(int fiveHundred, int oneHundred, int fifty, int ten, int five, int one){
        this.fiveHundred = fiveHundred;
        this.oneHundred = oneHundred;
        this.fifty = fifty;
        this.ten = ten;
        this.five = five;
        this.one = one;
    }

    public void AddCoins(int type, int mai){
        if(type == 500){
            fiveHundred = mai;
        } else if (type == 100){
            oneHundred = mai;
        } else if (type == 50){
            fifty = mai;
        } else if (type == 10){
            ten = mai;
        } else if (type == 1){
            one = mai;
        }
    }

    public void GetCount(){
        System.out.println("500円" + this.fiveHundred + "枚　100円" + this.oneHundred + "枚　50円" + this.fifty + "枚　10円" + this.ten + "枚　5円" + this.five + "枚　1円" + this.one + "枚");
    }

    public void GetAmount(){
        System.out.println("総額は" + (500*this.fiveHundred + 100*this.oneHundred + 50*this.fifty + 10*this.ten + 5*this.five + this.one) + "円");
    }
}
