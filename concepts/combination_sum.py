result = []
def combinations(lst, target):
    combination_helper(lst, target, 0, 0, [])
    return result

def combination_helper(lst, target, sum_till_now, idx, items_till_now):
    if idx >= len(lst) or sum_till_now > target:
        return
    elif sum_till_now == target:  
        print(items_till_now)
        result.append(items_till_now)
        return
    else:
        sum_till_now += lst[idx]
        items_till_now.append(lst[idx])
        combination_helper(lst, target, sum_till_now, idx, items_till_now)
        sum_till_now -= lst[idx]
        items_till_now.pop()
        combination_helper(lst, target, sum_till_now, idx+1, items_till_now)





print(combinations([1,2,3], 3))