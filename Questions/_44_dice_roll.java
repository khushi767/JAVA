public class _44_dice_roll {
    int dice_roll(){
        double random=Math.random()*6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args){
        _44_dice_roll dice=new _44_dice_roll();
        for(int i=0;i<6;i++){
            System.out.println(dice.dice_roll());

        }
        

    }
}
