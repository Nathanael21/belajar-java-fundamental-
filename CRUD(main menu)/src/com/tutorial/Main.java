package com.tutorial;
import java.io.*;
import java.time.Year;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner userInput = new Scanner(System.in);
        String userOption;
        boolean isContinue = true;
        while (isContinue){
            clrScreen();
            System.out.println("====Database Perpustakaan====\n");
            System.out.println("1.\t Lihat Seluruh Buku");
            System.out.println("2.\t Cari Buku");
            System.out.println("3.\t Tambah Data Buku");
            System.out.println("4.\t Ubah Data Buku");
            System.out.println("5.\t Hapus Data Buku");
            System.out.print("\n\nPilihan Anda = ");
            userOption = userInput.next();
            switch (userOption) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("List Seluruh Buku");
                    System.out.println("=================");
                    tampilData();
                    break;
                case "2" :
                    System.out.println("\n================");
                    System.out.println("Cari Data Buku");
                    System.out.println("================");
                    cariData();
                    break;
                case "3" :
                    System.out.println("\n=================");
                    System.out.println("Tambah Data Buku");
                    System.out.println("=================");
                    tambahData();
                    tampilData();
                    break;
                case "4" :
                    System.out.println("\n=================");
                    System.out.println("Ubah Data Buku");
                    System.out.println("=================");
                    ubahData();
                    break;
                case "5":
                    System.out.println("\n=================");
                    System.out.println("Hapus Data Buku");
                    System.out.println("=================");
                    hapusData();
                    break;
                default:
                    System.err.print("\nInput anda tidak benar silahkan masukan input sebagai berikut \n" +
                        "1,2,3,4,5");
            }

            isContinue = getYesOrNo("Apakah anda ingin melanjutkan?(y/n)");

        }
    }

    public static void tampilData() throws IOException{

        FileReader fileInput;
        BufferedReader fileInputBuffered;
        try {
            fileInput = new FileReader ("database.txt");
            fileInputBuffered = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("\ndatabase tidak tersedia");
            System.err.println("silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }
        System.out.print("\n--------------------------------------------------------------------------");
        System.out.println("\n| No |\tTahun |\t Penulis              |\t Penerbit   |\t Judul           |");
        System.out.print("--------------------------------------------------------------------------\n");

        String isiFile = fileInputBuffered.readLine();
        int no = 1;
        while (isiFile != null) {
            StringTokenizer file = new StringTokenizer(isiFile, ",");

            file.nextToken();
            System.out.printf("| %02d |", no);
            System.out.printf("  %4s  |", file.nextToken());
            System.out.printf("\t%-20s  |", file.nextToken());
            System.out.printf("\t%-10s  |", file.nextToken());
            System.out.printf("\t%-15s  |", file.nextToken() );
            System.out.println();
            isiFile = fileInputBuffered.readLine();
            no++;
        }
        System.out.println("--------------------------------------------------------------------------");
        boolean isTambah = getYesOrNo("Apakah anda ingin menambah data buku?(y/n)");
    }

    public static void cariData() throws IOException{
        // membaca
        FileReader fileInput;
        BufferedReader fileInputBuffered;
        try {
            fileInput = new FileReader ("database.txt");
        }catch (Exception e){
            System.err.println("\ndatabase tidak tersedia");
            System.err.println("silahkan tambah data terlebih dahulu");
            return;
        }

        // ambil keyword dari user
        Scanner userKey = new Scanner(System.in);
        System.out.println("Masukan Keyword data yang ingin dicari");
        String hasil = userKey.nextLine();
        String[] keyword = hasil.split("\\s");

        // cek keywoard di database
        checkBuku(keyword,true);
    }

    private static boolean checkBuku(String[] keyword , boolean isDisplay) throws IOException{
        FileReader database = new FileReader("database.txt");
        BufferedReader databaseBuff = new BufferedReader(database);
        String data = databaseBuff.readLine();
        boolean isExist = false;
        int no = 0;
        if (isDisplay){
        System.out.println("====Hasilnya====");
                System.out.print("\n--------------------------------------------------------------------------");
                System.out.println("\n| No |\tTahun |\t Penulis              |\t Penerbit   |\t Judul           |");
                System.out.print("--------------------------------------------------------------------------\n");
        }
                while(data != null){
            // System.out.println(Arrays.toString(keyword));

           // cekk keyword
             isExist = true;
             for (String keywords : keyword ){
                 isExist = isExist && data.toLowerCase().contains(keywords.toLowerCase());
             }

           // jika keyword cocok maka akan menampilkan
            if (isExist){
                if (isDisplay){
                    no++;
                    StringTokenizer hasil = new StringTokenizer(data,",");

                    hasil.nextToken();
                    System.out.printf("| %02d |", no);
                    System.out.printf("  %4s  |", hasil.nextToken());
                    System.out.printf("\t%-20s  |", hasil.nextToken());
                    System.out.printf("\t%-10s  |", hasil.nextToken());
                    System.out.printf("\t%-15s  |", hasil.nextToken() );
                    System.out.println();
                }else{
                    break;
                }
            }
            data = databaseBuff.readLine();
        }
            if (isDisplay){
                System.out.println("--------------------------------------------------------------------------");
            }
            return isExist;
    }

    public static void tambahData() throws IOException{
        //mengambil inputan user
        Scanner scan  = new Scanner(System.in);
        // menggunakan append untuk menambahkan dibelakangnya bukan menulis ulang
        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter fileOutputBuff = new BufferedWriter(fileOutput);

        String penulis,judul,penerbit,tahun;

        // mengambil inputan dari untuk penulis
        System.out.print("Masukan Penulis : ");
        penulis = scan.nextLine();

        // mengambil inputan untuk judul
        System.out.print("Masukan Judul Buku : ");
        judul = scan.nextLine();

        // mengambil inputan untuk penerbit
        System.out.print("Masukan Penerbit Buku : ");
        penerbit = scan.nextLine();

        // mengambil inputan untuk tahun
        System.out.print("Masukan Tahun Terbit : ");
        tahun = scan.next();
        tahun = parseYear(tahun);

        String[] keyword = {tahun+","+penulis+","+penerbit+","+judul};
        boolean isExist = checkBuku(keyword,false);

        //memasukan data ke database
        if(!isExist){
            String penulisPrimary = penulis.replaceAll("\\s","");
            long noEntry = ambilNoEntry(penulis,tahun) + 1;
            String primaryKey = penulisPrimary + "_" + tahun + "_" + noEntry;
            System.out.println("data yang akan anda masukan adalah ");
            System.out.println("------------------------------------");
            System.out.println("Primary Key  : " + primaryKey);
            System.out.println("Tahun Terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Judul        : " + judul);
            System.out.println("Penerbit     : " + penerbit);
            boolean isTambah = getYesOrNo("Apakah anda ingin menambah data tersebut?");
            if (isTambah){
                fileOutputBuff.write(primaryKey + "," + tahun + "," + penulis + "," +
                        penerbit + "," + judul);
                fileOutputBuff.newLine();
                fileOutputBuff.flush();
            }
        }else{
            System.err.println("Buku sudah tersedia");
            checkBuku(keyword,true);
        }

        fileOutput.close();
        fileOutputBuff.close();
    }

    public static long ambilNoEntry(String penulis , String tahun ) throws IOException{
        FileReader input = new FileReader("database.txt");
        BufferedReader inputBuff = new BufferedReader(input);

        long entry = 0;
        String data = inputBuff.readLine();
        Scanner scan ;
        String primaryKey;

        while (data != null){
            scan = new Scanner(data);
            scan.useDelimiter(",");
            primaryKey = scan.next();
            scan = new Scanner(primaryKey);
            scan.useDelimiter("_");

            penulis = penulis.replaceAll("\\s","");
            if (penulis.equalsIgnoreCase(scan.next()) && tahun.equalsIgnoreCase(scan.next())){
                entry = scan.nextInt();
            }
            data = inputBuff.readLine();
        }
        return entry;
    }

    public static String parseYear(String tahun) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean correctYear = false;
        while(!correctYear){
            try{
                Year.parse(tahun);
                correctYear = true;
            }catch (Exception e){
                System.err.print("Masukan tahun dengan benar\n");
                System.out.print("\nMasukan Tahun Terbit : ");
                tahun = scan.next();
            }
        }
        return tahun;
    }

    public static void hapusData() throws IOException{
        // mengambil db asli
         File database = new File("database.txt");
         FileReader input = new FileReader(database);
         BufferedReader inputBuff = new BufferedReader(input);

        // membuat database sementara
        File tempDB = new File ("tempDB.txt");
        FileWriter outputTemp = new FileWriter(tempDB);
        BufferedWriter outputTempBuff = new BufferedWriter(outputTemp);

        // tampilkan data
        System.out.println("List Buku");
        tampilData();

        // mengambil user input
        Scanner scanUser = new Scanner(System.in);
        System.out.print("Masukan urutan buku yang akan di hapus : ");
        int pilihan = scanUser.nextInt();

        // looping membaca data baris dan skip data yang dihapus

        int countData = 0;
        boolean isFound = false;

        // baca perbaris
        String data = inputBuff.readLine();
        while (data != null){
            countData++;
            StringTokenizer dataKata = new StringTokenizer(data,",");
            boolean isDelete = false;
        // tampilkan data yang ingin di hapus
            if (pilihan == countData){
                System.out.println("\nData yang ingin anda hapus : ");
                System.out.println("-----------------------------");
                System.out.println("Referensi  : " + dataKata.nextToken());
                System.out.println("Tahun      : " + dataKata.nextToken());
                System.out.println("Penulis    : " + dataKata.nextToken());
                System.out.println("Penerbit   : " + dataKata.nextToken());
                System.out.println("Judul      : " + dataKata.nextToken());
                isDelete = getYesOrNo("apakah anda yakin ingin menghapusnya?");
                isFound = true;
            }

            if (isDelete){
                // Skip pindahkan data dari ori ke temp
                System.out.println("data berhasil di hapus");
            }else{
                // pindahkan data dari ori ke temp
                outputTempBuff.write(data);
                outputTempBuff.newLine();
            }
            data = inputBuff.readLine();
        }

        if (!isFound){
            System.err.println("Data Tidak ditemukan");
        }


        // menulis file
        outputTempBuff.flush();

        input.close();
        inputBuff.close();
        outputTemp.close();
        outputTempBuff.close();
        System.gc();
        // menghapus db
        database.delete();

        // merename tempdb
        tempDB.renameTo(database);


    }

    public static void ubahData() throws  IOException{
        Scanner scanPilihan = new Scanner(System.in);
        // membaca file input
        File input = new File("database.txt");
        FileReader inputs = new FileReader(input);
        BufferedReader inputsBuff = new BufferedReader(inputs);

        // membaca file
        File output = new File("tempDb.txt");
        FileWriter outputs = new FileWriter(output);
        BufferedWriter ouputsBuff = new BufferedWriter(outputs);

        // mengakses db per line
        String data = inputsBuff.readLine();

        // menampilkan seluruh data
        tampilData();

        // mengambil inputan user
        System.out.print("Masukan Urutan yang ingin di Ubah = ");
        int pilihan = scanPilihan.nextInt();

        boolean isFound = false;
        int dataCount = 0;

        while (data != null){
            dataCount++;

            StringTokenizer dataAsli = new StringTokenizer(data,",");
            if (dataCount == pilihan) {
                System.out.println("----------------------------------------------");
                System.out.println("\nData yang anda pilih : ");
                System.out.println("----------------------------------------------");
                System.out.println("Referensi    : " + dataAsli.nextToken());
                System.out.println("Tahun Terbit : " + dataAsli.nextToken());
                System.out.println("Penulis      : " + dataAsli.nextToken());
                System.out.println("Penerbit     : " + dataAsli.nextToken());
                System.out.println("Judul        : " + dataAsli.nextToken());
                System.out.println("----------------------------------------------");
                isFound = true;

                // update data
                String[] fields = {"Tahun Terbit","Penulis","Penerbit","Judul"};
                String[] tempData = new String[4];
                dataAsli = new StringTokenizer(data,",");

                String originalData = dataAsli.nextToken();
                for(int i = 0; i < fields.length ; i++){
                    boolean isUpdate = getYesOrNo("apakah anda ingin mengubah " + fields[i] + " ?");
                    originalData = dataAsli.nextToken();
                    if (isUpdate){

                        if (fields[i].equalsIgnoreCase("tahun")){
                            Scanner tahun = new Scanner(System.in);
                            System.out.print("Masukan Tahun Terbit : ");
                            String Tahun = tahun.next();
                            tempData[i] = parseYear(Tahun);
                        }else{
                            Scanner inputUpdate = new Scanner(System.in);
                            System.out.print("Masukan " + fields[i] + " Baru = ");
                            tempData[i] = inputUpdate.nextLine();
                        }
                    }else{
                        tempData[i] = originalData;
                    }
                }
                dataAsli = new StringTokenizer(data,",");
                dataAsli.nextToken();
                System.out.println("----------------------------------------------");
                System.out.println("\nData Baru : ");
                System.out.println("----------------------------------------------");
                System.out.println("Tahun Terbit : " + dataAsli.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis      : " + dataAsli.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit     : " + dataAsli.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul        : " + dataAsli.nextToken() + " --> " + tempData[3]);
                System.out.println("----------------------------------------------");
                boolean isYakin = getYesOrNo("apakah anda yakin ingin mengganti data tersebut? ");
                if (isYakin){
                    boolean isExist = checkBuku(tempData,false);
                    if (isExist){
                        System.err.println("Data Sudah Terdapat Dalam Data Base");
                        ouputsBuff.write(data);
                        ouputsBuff.newLine();
                    }else{
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        long noEntry = ambilNoEntry(penulis,tahun) + 1;
                        String penulisPrimary = penulis.replaceAll("\\s","");
                        String primaryKey = penulisPrimary + "_" + tahun + "_" + noEntry;
                        ouputsBuff.write(primaryKey + "," + tahun + "," + penulis + "," +
                                penerbit + "," + judul);
                        ouputsBuff.newLine();
                    }
                }else{
                    ouputsBuff.write(data);
                    ouputsBuff.newLine();
                }
            }else{
                //copy data
                ouputsBuff.write(data);
                ouputsBuff.newLine();
            }
          data = inputsBuff.readLine();
        }
        if (!isFound){
            System.err.println("data tidak ditemukan");
        }
        ouputsBuff.flush();
        inputs.close();
        inputsBuff.close();
        outputs.close();
        ouputsBuff.close();


        System.gc();
        input.delete();
        output.renameTo(input);
    }



    public static void clrScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch (Exception e){
            System.err.println("tidak bisa clear screen");
        }
    }

    private static boolean getYesOrNo(String message){
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n\n" + message);
        String userOption1 = userInput.next();

        while(!userOption1.equalsIgnoreCase("y") && !userOption1.equalsIgnoreCase("n")){
            System.err.print("Bukan Y atau N silahkan masukan kembali (y/n)");
            System.out.print("\n\n" + message);
            userOption1 = userInput.next();
        }
        return userOption1.equalsIgnoreCase("y");
    }

}
