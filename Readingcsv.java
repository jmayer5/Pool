public class Readingcsv
{

 	BufferedReader CSVFile = new BufferedReader(new FileReader("PoolData.csv"));

    String dataRow = CSVFile.readLine();
    // Read the number of the lines in .csv file 
	// i = row of the .csv file
	int i = 0; 
    while (dataRow != null){
    	i++;
        dataRow = CSVFile.readLine();

        }
      System.out.println(i);
      // Close the file once all data has been read.
      CSVFile.close();

      // End the printout with a blank line.
      System.out.println();

      // Save into arrays
      customer_id = new String[i];
      company_name = new String[i];
      department = new String[i];
      employer = new String[i];
      country = new String[i];
      zipcode = new String[i];
      address = new String[i];
      city = new String[i];
      smth1 = new String[i];
      smth2 = new String[i];
      phone_no1 = new String[i];
      phone_no2 = new String[i];
      email = new String[i];
      website = new String[i];
      customer_no = new String[i];

      // Read first line.
      // The while checks to see if the data is null. If 
      // it is, we've hit the end of the file. If not, 
      // process the data.
      int j;
      int counter;
      i = 0;

      // Read the file again to save the data into arrays
      BufferedReader CSV = 
            new BufferedReader(new FileReader("Sub-Companies.csv"));

      String data = CSV.readLine();

      while (data != null){
          String[] dataArray = data.split(";");
          for (String item:dataArray) {
            customer_id[i] = dataArray[0];
            company_name[i] = dataArray[1];
            department[i] = dataArray[2];
            employer[i] = dataArray[3];
            country[i] = dataArray[4];
            zipcode[i] = dataArray[5];
            address[i] = dataArray[6];
            city[i] = dataArray[7];
            smth1[i] = dataArray[8];
            smth2[i] = dataArray[9];
            phone_no1[i] = dataArray[10];
            phone_no2[i] = dataArray[11];
            email[i] = dataArray[12];
            website[i] = dataArray[13];
            customer_no[i] = dataArray[14];
            }


          //System.out.print(address[i] + "\n"); 
          data = CSV.readLine(); // Read next line of data.
          i++;
      }

}