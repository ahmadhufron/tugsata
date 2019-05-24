/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanbusanamuslim;

/**
 *
 * @author ASUS X441SA
 */
public class judul {
    String text; 
        public judul (String kata) //Constructor namanya sama dengan class dengan argumen kata 
    {
        this.text = kata ; // memanggil variabel text, membuktikan variabel text kepunyaan objek t
       
    }
        public String intro() //Method non parameter, buat method return type intro, diisikan ke variabel text 
    {
        return (text);
    }


}
