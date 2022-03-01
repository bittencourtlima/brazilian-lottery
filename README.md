# Brazilian lottery

Project created for study purposes.

This project uses clean architecture with MVI and coroutines.

The Dependency Injection uses dagger 2 as framework.

TODO:
- [X] Configure Dagger2
- [X] Configure NetworkModule with Retrofit
- [X] Create FeatureComponent and integrate with Dagger
- [X] Create data layer GameInstace feature
- [X] Create domain layer GameInstace feature
- [X] Create mapper and integrate domain and data layer
- [X] Create States and ViewModel for GameInstance feature
- [ ] Create ViewModelFactory and integrate with Dagger
- [ ] Create UI to show the summary of a game instance
- [ ] Extract UI logic into a Fragment to reuse for other games
