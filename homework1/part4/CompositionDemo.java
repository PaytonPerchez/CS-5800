package homework1.part4;

public class CompositionDemo {

	public static void main(String[] args) {
		Folder phpDemo1 = new Folder("php_demo1");
		Folder sourceFiles = new Folder("Source Files");
		Folder dotPhalcon = new Folder(".phalcon");
		Folder app = new Folder("app");
		Folder config = new Folder("config");
		Folder controllers = new Folder("controllers");
		Folder library = new Folder("library");
		Folder migrations = new Folder("migrations");
		Folder models = new Folder("models");
		Folder views = new Folder("views");
		Folder cache = new Folder("cache");
		Folder publicFolder = new Folder("public");
		File dotHtaccess = new File("", "htaccess");
		File dotHtrouter = new File(".htrouter", "php");
		File index = new File("index", "html");
		Folder includePath = new Folder("Include Path");
		Folder remoteFiles = new Folder("Remote Files");
		
		app.addFolder(config);
		app.addFolder(controllers);
		app.addFolder(library);
		app.addFolder(migrations);
		app.addFolder(models);
		app.addFolder(views);
		
		sourceFiles.addFolder(dotPhalcon);
		sourceFiles.addFolder(app);
		sourceFiles.addFolder(cache);
		sourceFiles.addFolder(publicFolder);
		sourceFiles.addFile(dotHtaccess);
		sourceFiles.addFile(dotHtrouter);
		sourceFiles.addFile(index);
		
		phpDemo1.addFolder(sourceFiles);
		phpDemo1.addFolder(includePath);
		phpDemo1.addFolder(remoteFiles);
		
		phpDemo1.print();
		
		System.out.println();
		sourceFiles.deleteFolder(app);
		phpDemo1.print();
		
		System.out.println();
		sourceFiles.deleteFolder(publicFolder);
		phpDemo1.print();
	}
}
