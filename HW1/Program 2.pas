Program AddNums(output);
    var
    input1:array [ 1..20] of integer;
    input2:array [ 1..20] of integer;
    output:array [ 1..40] of integer;
    incoming: integer;
    counter1: integer = 1;//size of input1
    counter2: integer = 1;//size of input2
    counter3: integer = 1;//size of output



procedure Print(var inputArray: array of integer; var size: integer);
    var 
    i:integer;

    begin
    For i:= 0 to size-2 do //not sure off by one error here, but it seems to get rid of the first index?
        begin
            write(inputArray[i], ' ');
      
        end;
    writeln(' ');
    
    
    
    
    end;
    
procedure Merge(var inputArray1: array of integer; var size1: integer;var inputArray2: array of integer; var size2: integer;var outputArray: array of integer);
    var 
    i:integer=0;
    j:integer=0;
    k:integer=0;
    
    
    begin
    
    //Print(inputArray1,size1);
    //Print(inputArray2,size2);
    
//    writeln(size1, ' size'); writeln(size2, ' size2');
    while (i<=size1-2) and (j<=size2-2) do //not sure off by one error here, but it seems to get rid of the first index?
        begin
        if (inputArray1[i] < inputArray2[j]) then
            begin
           outputArray[k] := inputArray1[i];
           // writeln(inputArray1[i], ' i to be added is here', i);
            // writeln(outputArray[k], ' i added');
           i:= i + 1;
           k:= k + 1;
           end
           
        else 
        begin
            outputArray[k] := inputArray2[j];
            // writeln(inputArray2[j], ' j to be added is here', j);
            // writeln(outputArray[k], ' j added');
             j:= j + 1;
             k:= k + 1;
        end;
            
            
        end;
   while i<=size1-2 do
       begin
        outputArray[k] := inputArray1[i];
        //writeln(inputArray1[i], ' i to be added is here later', i);
        //writeln(outputArray[k], ' i added later');
               i:= i + 1;
               k:= k + 1;
       end;
       
    while j<=size2-2 do
       begin
        outputArray[k] := inputArray2[j];
        //writeln(inputArray2[j], ' j to be added is here later', j);
        //writeln(outputArray[k], ' j added later');
                 j:= j + 1;
                 k:= k + 1;
       end;
    
    counter3 := k+1;//increment size


end;



begin
    
    while not eoln do //when reach eol stop.
        begin
        read(incoming); //read from Stdin
          
        input1[counter1] := incoming; //store in the counter
        //write(input1[counter1], ' ');
        //write(input1[0], ' ');
        counter1:= counter1 + 1; //increment counter
        
    end;
    readln();
    while not eoln do //when reach eol stop.
        begin
        read(incoming); //read from Stdin
        input2[counter2] := incoming; //store in the counter
        counter2:= counter2 + 1; //increment counter
        
    end;
    //write(input1[0], ' UMMMM ');
    Print(input1,counter1);
    Print(input2,counter2);
    Merge(input1,counter1,input2,counter2,output);
    Print(output,counter3);
     //write(input1[0], ' UMMMM ');
   
end.