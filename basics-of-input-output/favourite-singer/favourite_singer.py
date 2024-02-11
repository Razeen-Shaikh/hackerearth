def count_favourite_singers(n, playlist):
    """
    Count the number of times each singer appears in the playlist.
    
    Args:
        n (int): The total number of singers.
        playlist (list): A list of singers in the playlist.
    
    Returns:
        dict: A dictionary where the keys are the singers and the values are the counts.
    """
    # Create a dictionary to store the count of each singer
    singer_counts = {}

    # Iterate through the playlist and update the count for each singer
    for singer in playlist:
        if singer in singer_counts:
            singer_counts[singer] += 1
        else:
            singer_counts[singer] = 1

    # Find the maximum count
    max_count = max(singer_counts.values())

    # Count the number of singers with the maximum count
    num_favourite_singers = sum(1 for count in singer_counts.values() if count == max_count)

    return num_favourite_singers

# Input
n = int(input())
playlist = list(map(int, input().split()))

# Output
print(count_favourite_singers(n, playlist))
