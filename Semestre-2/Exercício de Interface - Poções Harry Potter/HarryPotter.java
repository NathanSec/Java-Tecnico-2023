package HP;

// Interface Poção

interface Potion {
    void mix(); // Um método para misturar as poções

    void heat(); // Um método para aquecer as poções

    void drink(); // Um método para beber as poções
}

class LovePotion implements Potion {

    @Override // Polimorfismo

    public void mix() {
        System.out.println("Misturando os ingredientes da poção do amor.");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção no caldeirão com um toque de paixão.");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa que bebeu a poção se APAIXONA PROFUNDAMENTE.");
    }

}

class InvisibilityPotion implements Potion {

    @Override

    public void mix() {
        System.out.println("Misturando os ingredientes da poção da Invisibilidade.");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção no caldeirão até que ela fique transparente.");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa que bebeu a poção se torna INVISIVEL.");
    }
}

class LifePotion implements Potion {

    @Override

    public void mix() {
        System.out.println("Misturando os ingredientes da poção da Vida.");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção no caldeirão de forma homogênea.");
    }
    
    @Override
    public void drink() {
        System.out.println("A pessoa que bebeu a poção tem suas feridas curadas.");
    }
}

class StrenghtPotion implements Potion{

    @Override
    public void mix(){
        System.out.println("Misturando os ingredientes da poção da Força.");
    }
    
    @Override
    public void heat(){
        System.out.println("Aquecendo a poção no caldeirão com força bruta.");
    }

    @Override
    public void drink(){
        System.out.println("A pessoa que bebeu a poção recebe o dom da força.");
    }
}
