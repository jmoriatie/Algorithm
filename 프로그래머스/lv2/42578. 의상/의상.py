def solution(clothes):
    answer = 1  
    print(clothes)
    
    dic  = {}
    for i in range(len(clothes)):
        key = clothes[i][1]
        if key not in dic:
            dic[key] = 1
        else:
            dic[key] = dic[key]+1
        
    for k in dic.keys():
        answer *= (dic[k]+1)
    
    answer -= 1
    
    return answer