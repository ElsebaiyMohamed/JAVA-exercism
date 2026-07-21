"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

#TODO (student): Remove 'pass' and complete the 'bake_time_remaining()' function below.
def bake_time_remaining(elapsed_bake_time: int):
    """Calculate the bake time remaining.

    Parameters:
        elapsed_bake_time (int): The baking time already elapsed.

    Returns:
        int: The remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time

def preparation_time_in_minutes(number_of_layers: int):
    """Calculate the preparation time of lasagna.

        Parameters:
            number_of_layers (int): The number of layers tha lasagna has.
    
        Returns:
            int: The preparation time (in minutes) derived from 'PREPARATION_TIME'.
    
        Function that takes the number of layers the lasagna has as
        an argument and returns how many minutes the lasagna would spend to prepare based on the `PREPARATION_TIME`.
    """

    return PREPARATION_TIME * number_of_layers


def elapsed_time_in_minutes(number_of_layers: int, elapsed_bake_time: int):
    """Calculate the total time you have been in the kitchen cooking lasagna.

        Parameters:
            number_of_layers (int): The number of layers tha lasagna has.
            elapsed_bake_time (int): The number of minutes the lasagna has spent baking in the oven already
    
        Returns:
            int: The total time (in minutes) you have been in the kitchen cooking lasagna.
    
        Function that takes the number of layers the lasagna has and the number of minutes in the oven the lasagna was as an argument and returns how many minutes you spend to prepare lasagna in kitchen.
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
    
