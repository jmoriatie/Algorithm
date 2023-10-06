def solution(n,a,b):
    count = 0
    while a != b: 
        a = int(a/2 + a%2)
        b = int(b/2 + b%2)
        
        count +=1

    return count