package com.example.draggerdemoapp

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModules {

    /** make this method static to improve performance if there is no instance variable used in this method**/
    companion object{
        @Provides
        fun getMemoryCard(): MemoryCard{
            return MemoryCard()
        }
    }

}