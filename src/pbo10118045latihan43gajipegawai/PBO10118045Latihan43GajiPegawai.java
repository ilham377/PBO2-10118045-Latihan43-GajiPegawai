/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan43gajipegawai;

/**
 *
 * @author
 * Nama     : Muhammad Ilham Apriyadi
 * Kelas    : if 2
 * NIM      : 10118045
 * Deskripsi Program : Gaji Pegawai
 */
public class PBO10118045Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gajiPgw = new GajiPegawai();
        gajiPgw.setNama("Rizaki Adam Kurniawan");
        gajiPgw.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajiPgw.setUangTransport(250000);
        gajiPgw.setUangTunjangan(300000);
        gajiPgw.setGajiPokok(4500000);
        gajiPgw.tampilData(gajiPgw.getNama(), gajiPgw.getAlamat(), gajiPgw.getUangTransport(), gajiPgw.getUangTunjangan(), gajiPgw.getGajiPokok(), gajiPgw.getTotalGaji());
    }
    
}
