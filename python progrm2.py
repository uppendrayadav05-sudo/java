n=int(input("enter the number of elements in list A:"))
A=[]
for i in range(n):
    value=int (input(f"enter element {i+1}:"))
    A.append(value)
print("\nlistA;",A)
m=int(input("\n enter the number of elements in list B:"))
B=[]
for i in range(m):
    value=int(input(f"enter element {i+1}:"))
    B.append(value)
print("list B:",B)
print("\n---list operations---")
print("concatenation(A+B):".A+B)
print("repetition(A*2):",A*2)
search value= int(input("enter index to update in list A:"))
print("IS", search-value"present in A?",search-value in A)
print("IS",search-value,"absent fromA?",search-value not in A)
if len(A)>0
index=int(input("enter index to update in list A:"))
if_len(A)<=index<len(A):
    new_value=int(input("enter the new value;"))
    A[index]= new_value
    print("list A after updating",A)
    else:
        print("invalid index.list A is unchanged.")
        delete_index=int(input("enter index to delete from list A:"))
        if_len(A)<delete_index<len(A)
        del A[delete_index]
        print("list A after deletion:",A)
        else:
            print("invalid index.list A is unchanged.")
            else:
            print("list A is empty:update and deletion are skipped.")
            print("\n---builtin functions---")
                if len(A)>0
                print("length:",len(A))
                print("minimum:",min(A))
                 print("maximum:",max(A))
                 print("sum:"sum(A))
                 print("sorted list:",sorted(A))
                 else:
                     print("list A is empty:numaric functions are skipped.")
                     print("\n---list methods---")
                     value=int(input("emter a value to append;"))
                     A.append(value)
                     print(after append():,A)
                            extra=input(
                                "enter additional integers separated by spaces (or press enter):").strip()
                            if extra:extra_values=list(map(int,extra.split()))
                            A.extend(extra_values)
                            print("after extend():"A)
                            insert-index=int(input("enter index for insertion:"))
                            insert-value=int(input("enter value to insert:"))
                            if-len(A)<=insert-index,insert-value)
                     print("after insert():",A)
                     else:
                         print("invalid insertion index. list A is unchanged")
                         remove-value=int(input("enter a value to remove")
                                          if(remove-value)
                                          print("after remove():",A)
                                          else:
                                              print("value not found.list Ais unchanged.")
                                              if len(A)>0
                                              removed=A.pop()
                                              print("element removed by pop():"removed)
                                              print("after pop():A)
                                                    else:
                                                        print("list is empty:pop()is skipped.")

                                                        A.sort()
                                                        A.reverse()
                                                        print("after reverse():",A)
                                                        count_value=int(input("enter a value to count:"))
                                                        print("occurence of ",count-value,":",acount-values))
                                                        print("\n final list A:",A)
                                                        print('paogram completed sucessfully.")
                     
                            
                      
        
    

    
