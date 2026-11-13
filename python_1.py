n=int(input("enter the number of elements:"))
numbers=[]
for i in range(n):
    element=int(input(f"enter element [i+1]:"))
    numbers.append(element)
print("\n created list:",numbers) 
if len (numbers)>0:
    print("\n---indexing---")
    print("first element(index0):",numbers[0])
    print("last element(index-1):",numbers[-1])
    index=int(input("enter an index to acess:"))
    if-len(numbers)<=index<len(numbers):
          print("element at index",index,":",numbers[index])
    else:
        print ("invlid index!")

        print("\n---slicing---")
        start=int(input("enter starting index:"))
        end=int(input("enter ending index:"))
        print("slice list:",numbers[start:end])
else:
    print("the list is empty, indexing and slicing are skipped.")
           
           
            
            
            
