package dev.hugo.models;

public class CalculatorImc {

    private Person person;
    private double imc;

    public CalculatorImc(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public double getImc() {
        return imc;
    }

    public void calculate() {
        imc = Math.rint((person.getWeight() / Math.pow(person.getHeight(), 2)) * 100) / 100;
    }

    public String getImcCategory() {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc >= 16 && imc < 17) {
            return "Delgadez moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Delgadez leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad leve";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
}
