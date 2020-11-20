package aula3.grupouninter.calculadorabasicauninter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btNumero1, btNumero2, btNumero3, btNumero4, btNumero5, btNumero6, btNumero7,
            btNumero8, btNumero9, btNumero0, btPonto, btIgual, btSomar, btDiminuir, btMultiplicar,
            btDividir, btApaga;
    TextView textValor2, textValor1, textOperacao, textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNumero0 = findViewById(R.id.btNumero0);
        btNumero1 = findViewById(R.id.btNumero1);
        btNumero2 = findViewById(R.id.btNumero2);
        btNumero3 = findViewById(R.id.btNumero3);
        btNumero4 = findViewById(R.id.btNumero4);
        btNumero5 = findViewById(R.id.btNumero5);
        btNumero6 = findViewById(R.id.btNumero6);
        btNumero7 = findViewById(R.id.btNumero7);
        btNumero8 = findViewById(R.id.btNumero8);
        btNumero9 = findViewById(R.id.btNumero9);
        btPonto = findViewById(R.id.btPonto);
        btIgual = findViewById(R.id.btIgual);
        btSomar = findViewById(R.id.btSomar);
        btDiminuir = findViewById(R.id.btDiminuir);
        btMultiplicar = findViewById(R.id.btMultiplicar);
        btDividir = findViewById(R.id.btDividir);
        btApaga = findViewById(R.id.btApaga);
        textValor1 = findViewById(R.id.textValor1);
        textValor2 = findViewById(R.id.textValor2);
        textOperacao = findViewById(R.id.textOperacao);
        textView2 = findViewById(R.id.textView2);


    }
boolean boll = false;  //criado condição booleana para quando clicar na operação(quando for true) para poder digitar o 2o número

    public void btNumero_1(View v) { // a função on click foi colocado na activity
        if (boll == false) {  // se condição booleana for igual a false
            String n1 = textValor1.getText().toString(); //pega o textValor1 e passa para String
            textValor1.setText(n1 + "1"); // seta o valor clicado no textValor1
        }
        else {
            String n1 = textValor2.getText().toString(); // aqui no casa a booleana foi true
            textValor2.setText(n1 + "1"); // seta o valor clicado no textValor2

        }
    }

    public void btNumero_2(View v){
        if (boll == false) {
            String n2 = textValor1.getText().toString();
            textValor1.setText(n2 + "2");
        }
        else {
            String n2 = textValor2.getText().toString();
            textValor2.setText(n2 + "2");

        }
    }

    public void btNumero_3(View v){
        if (boll == false) {
            String n3 = textValor1.getText().toString();
            textValor1.setText(n3 + "3");
        }
        else {
            String n3 = textValor2.getText().toString();
            textValor2.setText(n3 + "3");

        }

    }
    public void btNumero_4(View v){
        if (boll == false) {
            String n4 = textValor1.getText().toString();
            textValor1.setText(n4 + "4");
        }
        else {
            String n4 = textValor2.getText().toString();
            textValor2.setText(n4 + "4");

        }

    }
    public void btNumero_5(View v){
        if (boll == false) {
            String n5 = textValor1.getText().toString();
            textValor1.setText(n5 + "5");
        }
        else {
            String n5 = textValor2.getText().toString();
            textValor2.setText(n5 + "5");

        }

    }
    public void btNumero_6(View v){
        if (boll == false) {
            String n6 = textValor1.getText().toString();
            textValor1.setText(n6 + "6");
        }
        else {
            String n6 = textValor2.getText().toString();
            textValor2.setText(n6 + "6");

        }

    }
    public void btNumero_7(View v){
        if (boll == false) {
            String n7 = textValor1.getText().toString();
            textValor1.setText(n7 + "7");
        }
        else {
            String n7 = textValor2.getText().toString();
            textValor2.setText(n7 + "7");

        }

    }
    public void btNumero_8(View v){
        if (boll == false) {
            String n8 = textValor1.getText().toString();
            textValor1.setText(n8 + "8");
        }
        else {
            String n8 = textValor2.getText().toString();
            textValor2.setText(n8 + "8");

        }

    }
    public void btNumero_9(View v){
        if (boll == false) {
            String n9 = textValor1.getText().toString();
            textValor1.setText(n9 + "9");

        }
        else {
            String n9 = textValor2.getText().toString();
            textValor2.setText(n9 + "9");

        }

    }

    public void btNumero_0(View v){
        if (boll == false) {
            String n0 = textValor1.getText().toString();
            textValor1.setText(n0 + "0");
        }
        else {
            String n0 = textValor2.getText().toString();
            textValor2.setText(n0 + "0");

        }

    }
    public void bt_Ponto(View v){
        if (boll == false) {
            String ponto = textValor1.getText().toString();
            if (ponto.contains(".")) {
            }
            else {

                textValor1.setText(ponto + ".");

            }
        }
        else {
            String ponto = textValor2.getText().toString();

            if (ponto.contains(".")) {
            }
            else {

                textValor2.setText(ponto + ".");

            }
        }

    }

    public void bt_Igual(View v){

        float valor1 = Float.parseFloat(textValor1.getText().toString()); // valor 1 recebe o textValor1 e passa para String
        float valor2 = Float.parseFloat(textValor2.getText().toString());// valor 2 recebe o textValor2 e passa para String
        String oper = textOperacao.getText().toString(); // oper recebe o textoOperacao e passa para String
        float resultado = 0;
        switch (oper) {
            case "X":
                resultado = valor1 * valor2;
                break;
            case "÷":
                resultado = valor1 / valor2;
                break;
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            default:
                textView2.setText("Operação Inválida");

        };
        textView2.setText((String.valueOf(resultado)));
        /*

            if (oper.contains("X")) { // condição se contém "X" vai fazer a operação abaixo

                float resultado = (valor1 * valor2); // operação aritmética
                textView2.setText("= " + resultado); // quando clicar no "=" ele seta o resultado no textView2

            }
            else if (oper.contains("÷")) { // senão se  vai fazer a operação abaixo

                float resultado = (valor1 / valor2);
                textView2.setText("= " + resultado);

            }
            else if (oper.contains("+")) {

                float resultado = (valor1 + valor2);
                textView2.setText("= " + resultado);

            }
            else if (oper.contains("-")) {

                float resultado = (valor1 - valor2);
                textView2.setText("= " +  resultado);

            }*/

        }


    public void bt_Somar(View v){
        boll = true;
        textOperacao.setText("+"); // setado o botao somar com +

    }
    public void bt_Diminuir(View v){
        boll = true;
        textOperacao.setText("-");

    }
    public void bt_Multiplicar(View v){
        boll = true;
        textOperacao.setText("X");

    }
    public void bt_Dividir(View v){
        boll = true;
        textOperacao.setText("÷");

    }

    public void bt_Apaga(View v){ // apaga todos os valores
        boll = false;
        textValor1.setText("");
        textValor2.setText("");
        textOperacao.setText("");
        textView2.setText("");

    }

}


