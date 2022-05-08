package com.company.generics;

public class NewWrapper <E extends Wrapper<? super User,? extends User>>{ // 1. lower bounded, 2. upper bounded

    E object;




}
