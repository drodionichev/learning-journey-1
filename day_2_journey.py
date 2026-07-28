def add_fruct_in_cart(fruct, fructs=None):
    if fructs is None:
        fructs = []
    fructs.append(fruct)
    return fructs