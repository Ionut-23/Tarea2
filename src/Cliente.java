public class Cliente extends Thread {


    @Override
    public void run() {
        try {
            while (!Main.list.isEmpty()) {
                System.out.println("Cliente - Voy a consumir " + Main.list.get(0));
                Main.list.remove(0);
                sleep(3000);
            }

        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cliente - Voy a esperar a que me traigan la comida.");
    }
}