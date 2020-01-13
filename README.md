# kotlinconf-playground

What follows isn't a conventional README, but instead is a summary of some of the topics I learned about while attending KotlinConf in Copenhagen, Denmark in December, 2019. I have also created a small sample app focused on Jetpack compose. 

## The Conference
I've attended a variety of tech conferences over the past five years, including Google I/O, and two AnDevCons. I found kotlinConf to be head and shoulders above the others both because of the quality of presenters, but also because of the single focus of the conference, Kotlin. Sadly, the conference was a bit shorter than others, with just two days of conferences. As is the case for every conference, I had to make some tough decisions regarding which talks to attend and which to skip. Luckily, nearly all of the sessions are now available [here](https://kotlinconf.com/talks/).

#### The Shuttle Case
Before getting into the technical side, I want to mention the keynote on day two. Sadly, it looks like this video is not available. Stephen Carver presented the importance of being agile through the lens the space race. First he presented NASA as the ultimate no-change culture; a stagnant, beaurocratic monolith, dominated  by middle-aged, career employees. Also, the program relied upon government funding, whcih came with pressure from forcesCarver presented a very compelling case that, had NASA been even slightly more agile, the Challenger crash never would have happened. 

He then presented the cases of Blue Origin and SpaceX. These companies are known to draw in a bright, motivated and diverse group of engineers. They're also into failing fast and moving on. <At this point in the presentation, there was an epic montage of unmanned shuttle lift offs gone entertainingly badly>. The presentation was excellent, and by using real examples that have touched us all, he conveyed a message of staying hungry, not being afraid to fail, but learning from it when you do.  It really was excellent and super motivating. 

Ok, now into the more technical side of things.  

#### Jetpack Compose

Ok, this one is SUPER exciting! Essentially, Jetpack Compose it is a toolkit that will change how native Android layouts are made. Gone will be the days of writing lines upon lines of xml to make the layout cooperate. With Jetpack compose, you create a "composable" function for each component in the UI. The beauty of these components is that you can very easily add them to other screens in the app. To create a composable function, you simply add @composable annotation to the function. 

There are some elements that come prepackaged in the Compose UI library. For example, you don't have to create your own composable function just to show a line of text. You'll just need to add "Text()" to your composable. Below I'll add a composable function to display a movie title.

    @composable
    fun MovieTitle(title: String) {
    Text(title)
    }

Now you can just add this composable to your onCreate's setContent() and you'll be showing the movie title in the UI. 


It can be as easy as that, but if you want to add some extra style, Text() and the other functions included in the library have optional parameters for adding options like style, spacing, wrapping, overflow, and maxLines. They can be added like so:
    
    Text(
        modifier = Spacing(0.dp, 12.dp, 12.dp, 0.dp),
        text = title,
        style = ((+MaterialTheme.typography()).h5).withOpacity(0.75f)
    )
  
One you have your composable component looking just right, you can use it on it's own or like a building block to create a more complex layout. As you can see below, you can simply add the MovieTitle() function from above to a more complex function that shows a movie title, description, and image together as one unit. 

    @Composable
     private fun MovieDetailItem(movie: Movie) {
     VectorImageFull(id = R.drawable.ic_launcher_foreground)
     MovieTitle(movie.title)
     MovieDescription(movie.description)
     }

So, you can see that components are super easy to write and combine. Another cool time saving feature of Jetpack Compose is that, by adding a function with @Preview annotation, you can see your updates in real time using the split preview. This is great for building a straightforward layout, but it is AWESOME for exploring and experimenting with different styles and elements. By adding and removing compose functions, from the preview function, you can easily compare different elements and visually experiment without touching any of the production code. Doing the same thing in xml would involve a great deal of cutting and pasting, special "tools" annotation, and tracking multiple xml files. 

I've written a small sample app here that takes the basic UI elements of a popular movie app I've written in another repo, to see how hard it would be to make a similar layout using Jetpack Compose.  

Sadly, Jetpack Compose is still pre-alpha, so it is a loooooong way off from stable release, but it is coming and it will change how Android UI is built. In the mean time, here are links to the relevant talks from KotlinConf:

[Compose Yourself: Designing a Kotlin First UI Toolkit](https://kotlinconf.com/talks/video/2019/126985/)

[The Compose Rutime, Demystified](https://kotlinconf.com/talks/video/2019/126961/)

[Android Jetpack <3 Kotlin](https://kotlinconf.com/talks/video/2019/129186/)


#### Other topics
I'll briefly mention a few other topics learned about at the conference. These are also things I would like to integrate into this sample app in time, but they will come in later slices. 

##### Coroutines
//TODO write Coroutines summary
Here are the Coroutine-specific talks from the conference:
[Coroutines Case Study: Cleaning up an Async API](https://kotlinconf.com/talks/video/2019/127279/)
[Testing with Coroutines](https://kotlinconf.com/talks/video/2019/116853/)

##### KTOR
//TODO write KTOR summary
Here are the conference talks focused on KTOR:
