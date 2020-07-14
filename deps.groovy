class ServicesPlugin implements Plugin<Project> {

    public final static String JSON_FILE_NAME = "example.json"
    public final static Pattern VARIANT_PATTERN = ~/(?:([^\p{javaUpperCase}]+)((?:\p{javaUpperCase}[^\p{javaUpperCase}]*)*)\/)?([^\/]*)/
    public final static Pattern FLAVOR_PATTERN = ~/(\p{javaUpperCase}[^\p{javaUpperCase}]*)/

    @Override
    void apply(Project project) {

        project.android.applicationVariants.all { variant ->
            handleVariantOpenFile(project, variant)
        }
    }
}
