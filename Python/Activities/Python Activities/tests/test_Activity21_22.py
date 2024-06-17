import pytest
@pytest.mark.activity
def test_add():
    num1 =  2
    num2 =  4
    sum = num1 + num2
    assert sum == 6

def test_subt():
    num1 = 9
    num2 = 3
    diff = num1 - num2 
    assert diff == 6


def test_prod():
    num1 = 6
    num2 = 8
    prod = num1 * num2
    assert prod == 48
    
@pytest.mark.activity
def test_quotient():
    num1 = 12
    num2 = 4
    quotient = 12 / 4
    assert quotient == 3
