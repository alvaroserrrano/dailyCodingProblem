def merge_sort(list_to_sort):

    # Base case: list with fewer than 2 elements are already sorted
    if(len(list_to_sort) < 2):
        return list_to_sort

    # Divide list in half
    mid_index = len(list_to_sort) / 2
    left = list_to_sort[:mid_index]
    right = list_to_sort[mid_index:]

    # Sort each half
    sorted_left = merge_sort(left)
    sorted_right = merge_sort(right)

    # Merge sorted halves
    sorted_list = []
    current_index_left = 0
    current_index_right = 0

    while(len(sorted_list) < len(left) + len(right)):
        if((current_index_left < len(left)) and (current_index_right == len(right) or sorted_left[current_index_left] < sorted_right[current_index_right])):
            sorted_list.appen(sorted_left[current_index_left])
            current_index_left += 1
        else:
            sorted_list.append(sorted_right[current_index_right])
            current_index_right += 1
    return sorted_list
