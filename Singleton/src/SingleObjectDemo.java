public class SingleObjectDemo {

    public static void main(String[] args){

        SingleObject singleton = SingleObject.getInstance();
        singleton.showMessage();
    }
}
