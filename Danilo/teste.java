package loja;

import javax.swing.JOptionPane;

public class Loja {
    public static void main(String[] args) {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe um número para cadastrar: \n1 - Servidor\n2 - Notebook\n3 - Desktop"
        ));

        switch (operacao) {
            case 1 -> cadastrarServidor();
            case 2 -> cadastrarNotebook();
            case 3 -> cadastrarDesktop();
        }
    }

    private static void cadastrarServidor() {
        Servidor S1 = new Servidor();
        S1.setMarca(JOptionPane.showInputDialog("Informe a marca: "));
        S1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: ")));
        S1.setQuant(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: ")));
        S1.setNumHd(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do HD: ")));
        S1.setSlotMem(Integer.parseInt(JOptionPane.showInputDialog("Informe o slot de memória: ")));
        S1.setTipoMem(JOptionPane.showInputDialog("Informe o tipo da memória: "));
        S1.setMarcaMem(JOptionPane.showInputDialog("Informe a marca da memória: "));
        S1.setCapacidMem(Integer.parseInt(JOptionPane.showInputDialog("Informe a capacidade da memória: ")));
        S1.setTipoHd(JOptionPane.showInputDialog("Informe o tipo do HD: "));
        S1.setMarcaHd(JOptionPane.showInputDialog("Informe a marca do HD: "));
        S1.setCapacidHd(Integer.parseInt(JOptionPane.showInputDialog("Informe a capacidade do HD: ")));
        S1.setTipoGab(JOptionPane.showInputDialog("Informe o tipo do gabinete: "));
        S1.setMarcaGab(JOptionPane.showInputDialog("Informe a marca do gabinete: "));
        S1.setTipoFonte(JOptionPane.showInputDialog("Informe o tipo da fonte: "));
        S1.setMarcaFonte(JOptionPane.showInputDialog("Informe a marca da fonte: "));
        S1.setPotenciaFonte(Integer.parseInt(JOptionPane.showInputDialog("Informe a potência da fonte: ")));
        imprimirDados(S1);
    }

    private static void cadastrarNotebook() {
        // Mesma lógica para cadastrar notebook...
    }

    private static void cadastrarDesktop() {
        // Mesma lógica para cadastrar desktop...
    }

    private static void imprimirDados(Computador computador) {
        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Preço: " + computador.getPreco());
        System.out.println("Quantidade: " + computador.getQuant());
        // Imprimir outros atributos específicos de cada tipo de computador...
    }
}
