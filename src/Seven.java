public class Seven {
      /*

    7 Skriv ett program som skriver ut följande rektanglar på konsolen med hjälp av loopar:
	a	b	c	d	e	f	g	h	i
  #-------  #---#---  ##------  --#--#--  #---#---  #-#-  ###---  --#--##  --#--
  -#------  -#---#--  --##----  --#--#--  -#-#----  -#-#  ###---  ---#-##  -----
  --#-----  --#---#-  ----##--  ########  --#-----  #-#-  ###---  ----#--  --#--
  ---#----  ---#---#  ------##  --#--#--  -#-#----  -#-#  ------  -----#-  --#--
                j	k
              #---#  ##--##--##--##--
              -#-#-  ##--##--##--##--
              --o--  wwwwww~~~~~~~~~~
              -#-#-  ################
              #---#

     */
      public static void main(String[] args) {

            int[][] longPrintOut = new int[4][78];
            int[][] longPrintOut2 = new int[5][23];

            System.out.println("a\t\t\tb\t\t\tc\t\td\t\te\t\t\tf\t\tg\t\th\t\ti");

            for (int i = 0; i < longPrintOut.length; i++) {
                  for (int j = 0; j < longPrintOut[i].length; j++) {
                        if (i == j)
                              System.out.print("#");
                        else if (j == 8 || j == 9 || j == 17 || j == 18 || j == 27 || j == 28 || j == 37 || j == 38 || j == 47 ||   // empty line
                                j == 48 || j == 54 || j == 55 || j == 62 || j == 63 || j == 71 || j == 72 ) {
                              System.out.print(" ");
                        } else if (i == 0 && j == 9 || i == 0 && j == 13 ||                                                     // #---#---
                                i == 1 && j == 10 || i == 1 && j == 14 ||                                                       // -#---#--
                                i == 2 && j == 11 || i == 2 && j == 15 ||                                                       // --#---#-
                                i == 3 && j == 12 || i == 3 && j == 16) {                                                       // ---#---#
                              System.out.print("#");
                        } else if (i == 0 && j == 19 || i == 0 && j == 20 ||                                                    //  ##------
                                i == 1 && j == 21 || i == 1 && j == 22 ||                                                       //  --##----
                                i == 2 && j == 23 || i == 2 && j == 24 ||                                                       //  ----##--
                                i == 3 && j == 25 || i == 3 && j == 26) {                                                       //  ------##
                              System.out.print("#");
                        } else if (i == 0 && j == 31 || i == 0 && j == 34 ||                                                    //  --#--#--
                                i == 1 && j == 31 || i == 1 && j == 34 ||                                                       //  --#--#--
                                i == 2 && j >= 29 && j <= 36 ||                                                                 // ########
                                i == 3 && j == 31 || i == 3 && j == 34) {                                                       // --#--#--

                              System.out.print("#");
                        } else if (i == 0 && j == 39 || i == 0 && j == 43 ||                                                    //  #---#---
                                i == 1 && j == 40 || i == 1 && j == 42 ||                                                       //  -#-#----
                                i == 2 && j == 41 ||                                                                            //  --#----
                                i == 3 && j == 40 || i == 3 && j == 42) {                                                       //  -#-#----
                              System.out.print("#");
                        } else if (i == 0 && j == 50 || i == 0 && j == 52 ||                                                    //  #-#-
                                i == 1 && j == 51 || i == 1 && j == 53 ||                                                       //  -#-#
                                i == 2 && j == 50 || i == 2 && j == 52 ||                                                       //  #-#-
                                i == 3 && j == 51 || i == 3 && j == 53) {                                                       //  -#-#
                              System.out.print("#");
                        } else if (i == 0 && j >= 56 && j <=58 ||                                                               //  ###---
                                i == 1 && j >= 56 && j <=58 ||                                                                  //  ###---
                                i == 0 && j >= 56 && j <=58 ) {                                                                 //  ###---
                              System.out.print("#");
                        } else if (i == 0 && j == 66 || i == 0 && j == 69 || i == 0 && j == 70 ||                               //  --#--##
                                i == 1 && j == 67 || i == 1 && j == 69 || i == 1 && j == 70 ||                                  //  --#--##
                                i == 2 && j == 68 ||                                                                            //  ----#--
                                i == 3 && j == 69) {                                                                            //  -----#-
                              System.out.print("#");
                        } else if (i == 0 && j == 75 ||                                                                         //  --#--
                                i == 1 && j == 75 ||                                                                            //  --#--
                                i == 3 && j == 75) {                                                                            //  -----
                              System.out.print("#");                                                                              //  --#--
                        } else
                              System.out.print("-");
                  }
                  System.out.println("");
            }

            System.out.println("\tj\t\t\tk");
            for (int i = 0; i < longPrintOut2.length; i++) {
                  for (int j = 0; j < longPrintOut2[i].length; j++) {
                        if (j == 6 || j == 7) {                                                                                 // empty line
                              System.out.print(" ");
                        } else if (i == 0 && j == 0 || i == 0 && j == 4 ||
                                i == 1 && j == 1 || i == 1 && j == 3 ||
                                i == 3 && j == 1 || i == 3 && j == 3 ||
                                i == 4 && j == 0 || i == 4 && j == 4) {
                              System.out.print("#");
                        } else if (i == 2 && j == 2) {
                              System.out.print("0");
                        } else if (i == 0 && j >= 8 && j <= 9 || i == 0 && j >= 12 && j <= 13 || i == 0 && j >=16 && j <= 17 || //  ##--##--##--##--
                                i == 0 && j >=20 && j <= 21 ||                                                                  //  ##--##--##--##--
                                i == 1 && j >= 8 && j <= 9 || i == 1 && j >= 12 && j <= 13 || i == 1 && j >=16 && j <= 17 ||    //  WWWWWW~~~~~~~~~-
                                i == 1 && j >=20 && j <= 21 ){                                                                  //  ################
                              System.out.print("#");
                        } else if (i == 2 && j >= 8 && j <= 13 ){

                              System.out.print("W");
                        } else if (i == 2 && j >=14 && j <= 22) {
                              System.out.print("~");
                        } else if (i == 3 && j >= 8 && j <= 22) {                                                                // print out # hela line
                              System.out.print("#");
                        } else if (i == 4 && j >= 8 && j <= 22 ){                                                                // empty line

                              System.out.print(" ");
                        } else
                              System.out.print("-");
                  }
                  System.out.println("");
            }
      }
}
