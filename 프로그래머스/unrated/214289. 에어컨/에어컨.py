def solution(temperature, t1, t2, a, b, onboard):

    maxSize = 1000 * 100 # 분*온도
    t1+=10
    t2+=10
    temperature+=10

    DP = [[maxSize] * 51 for _ in range(len(onboard))] # 다 맥스사이즈로 저장
    DP[0][temperature] = 0; # 실외온도 0분은 0에너지
    
    for i in range(1, len(onboard)): #소요시간만큼 -> 탑승정보 길이
        if (onboard[i] == 1): #차량탑승시
            row = t1
            high = t2
        else: # 차량 미탑승시 전체
            row = 0
            high = 50
            # row = min(t1, temperature)
            # high = max(t2, temperature)

        for j in range(row, high+1): # 실외,목적 온도 비교 => 최소값 누적 + or off (모든 경우의 수 계산)
            arr = [maxSize]
            # 1) 실외온도 < 목적온도
            if temperature < t1:
                if 0 <= j-1 <= 50: # 켜서 온도반대방향
                    arr.append(DP[i-1][j-1] + a) 
                if 0 <= j+1 <= 50: # 끄고 온도방향으로   
                    arr.append(DP[i-1][j+1]) 
            if temperature > t2:
                if 0 <= j-1 <= 50: # 끄고 온도방향으로
                    arr.append(DP[i-1][j-1]) 
                if 0 <= j+1 <= 50: # 켜서 온도반대방향   
                    arr.append(DP[i-1][j+1] + a) 
            if temperature == j: # 켜서 온도반대방향
                arr.append(DP[i-1][j]) 
            if t1 <= j <= t2: # 켜서 온도반대방향
                arr.append(DP[i-1][j] + b) 
            
            DP[i][j] = min(arr)
    
    return min(DP[len(onboard)-1])