# assignment3
1) I created AudioPlayer interface that defines the play(String audioType, String fileName) method,  MP3Player class, it can help to play MP3 files, WAVPlayer and AACPlayer interfaces with methods playWAV() and playAAC(), AdvancedAudioPlayer class, AudioAdapter class and MusicPlayerApp that demonstrates the adapter pattern in action.

2) There are Device interface that contains methods powerOn(), powerOff(), setChannel(int channel), and setVolume(int volume), concrete device classes like TVDevice, DVDDevice, SoundSystemDevice, RemoteControl class that contains a reference to Device, BasicRemote, AdvancedRemote (concrete remote controls) and HomeEntertainmentSystem what is demonstrates the flexibility of the bridge pattern by controlling different devices with the same remote.

3) In 3rd assignment I created MenuComponent abstract class that defines methods like getName(), getDescription(), getPrice(), and print(). Also MenuItem that represents individual dishes, Menu contains both MenuComponent objects (either MenuItem or Menu), and at the end RestaurantApp that demonstrates a multi-level menu and prints it.

4) Here I created Pizza interface that contains methods getDescription() and getCost(), concrete classes like MargheritaPizza, VegetarianPizza, ToppingDecorator that implements Pizza and serves as the base for all decorators, CheeseTopping, MushroomTopping, PepperoniTopping classes and PizzaShop demonstrates multiple toppings on a pizza.

5) There are device classes like Lights, Thermostat, SecuritySystem, EntertainmentSystem, SmartHomeFacade that encapsulates the interactions with all the devices.
Methods like leaveHome(), arriveHome(), nightMode(), and movieMode() and SmartHomeApp that demonstrates how the facade simplifies control of the entire smart home system were added too.

6) Sixth assignment has Character that contains intrinsic state and extrinsic state, CharacterFactory that manages character flyweights to reuse character objects, TextEditor what uses the CharacterFactory to render text and TextEditorApp that shows memory effciency by inserting and rendering a large amount of text.

7) Here I created VideoLecture interfacethat contains methods getInfo() and play(), RealVideoLecture what simulates loading and playing a video lecture, ProxyVideoLecture class what implements lazy loading, OnlineCourse that contains multiple video lectures, and one of the important step - LearningPlatformApp that demonstrates how video lectures are loaded lazily only when played.
