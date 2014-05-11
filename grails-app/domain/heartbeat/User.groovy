package heartbeat

/**
 * User domain class.
 */
class User {
	static transients = ['pass']
	static hasMany = [authorities: Role, heartBeats: HeartBeat, assetTypes: AssetType, remarks: Remark]
	static belongsTo = Role

	/** Username */
	String username
	/** User Real Name*/
	String userRealName
	/** MD5 Password */
	String passwd
	/** enabled */
	boolean enabled

	String email
	boolean emailShow

	/** description */
	String description = ''

	/** plain password to create a MD5 password */
	String pass = '[secret]'

	static constraints = {
		username(blank: false, unique: true)
		userRealName(blank: false)
		passwd(blank: false)
		enabled()
	}
    
    String toString(){
        return username
    }
}
