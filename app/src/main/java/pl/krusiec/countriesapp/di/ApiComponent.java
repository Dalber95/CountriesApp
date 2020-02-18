package pl.krusiec.countriesapp.di;

import dagger.Component;
import pl.krusiec.countriesapp.model.CountriesService;
import pl.krusiec.countriesapp.viewmodel.ListViewModel;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);
}
