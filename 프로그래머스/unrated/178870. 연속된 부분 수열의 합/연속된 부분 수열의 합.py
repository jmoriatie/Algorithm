def solution(sequence, k):
    answer = []
    sum = 0
    left = 0
    right = -1
    
    save_left = 0
    save_right = len(sequence)
    
    while True:
        #sum 값과 비교. 낮을 경우 right 증가
        if sum < k:
            right += 1
            if right == len(sequence):
                break
            sum += sequence[right]
        else: 
            sum -= sequence[left]
            left += 1
            if left == len(sequence):
                break
            
        if sum == k and (save_right-save_left) > (right-left):
            save_left = left
            save_right = right
            
    return [save_left, save_right]