package org.example;

    public class Lanches {
      private   String nomeLanche;
      private   int codigoLanche;
      private   double valorLanche;

        public Lanches(String nomeLanche, int codigoLanche, double valorLanche) {
            this.nomeLanche = nomeLanche;
            this.codigoLanche = codigoLanche;
            this.valorLanche = valorLanche;
        }
        public double getValorLanche(){
            return valorLanche;
        }
        public String getLanche(){
            return nomeLanche;
        }
        public int getCodigoLanche(){
            return codigoLanche;
        }
    }
